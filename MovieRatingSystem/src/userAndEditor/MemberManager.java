package userAndEditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberManager {
    
    
public static boolean createAccount(Member person) throws FileNotFoundException, IOException, ClassNotFoundException {

        if (person instanceof User) {
            ArrayList<User> userList = new ArrayList<User>();
            
            try {

                File file = new File("UserList.bin");

                if (file.exists()) {                    
                    ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                    userList = (ArrayList<User>) reader.readObject();                            
                    file.delete();
                }
                
                for (User user1 : userList) {
                    if (user1.getName().equals(person.getName())) {
                        return false;
                    }
                }
                
                userList.add((User)person);

                ObjectOutputStream userListStream = new ObjectOutputStream(new FileOutputStream(file));
                userListStream.writeObject(userList);
                userListStream.close();
                
            } catch (NullPointerException e) {
                System.out.println("Null Error");
            }
            
        } else { //editor
            ArrayList<Editor> editorList = new ArrayList<Editor>();
            try {
                File file = new File("EditorList.bin");

                if (file.exists()) {
                    ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                    editorList = (ArrayList<Editor>) reader.readObject();
                    file.delete();
                }
                
                for (Editor editor1 : editorList) {
                    if (editor1.getName().equals(person.getName())) {
                        return false;
                    }
                }

                editorList.add((Editor)person);

                ObjectOutputStream editorListStream = new ObjectOutputStream(new FileOutputStream("EditorList.bin"));
                editorListStream.writeObject(editorList);
                editorListStream.close();
                
            } catch (NullPointerException e) {
                System.out.println("Error Null");
            }
        }
        
        return true;

    }   
    

    public static void deleteAccount(String username) throws FileNotFoundException, IOException, ClassNotFoundException {

        ArrayList<User> users = new ArrayList<User>();
        File file = new File("UserList.bin");

        if (file.exists()) {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
            users = (ArrayList) reader.readObject();
            file.delete();
        }

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(username)) {
                users.remove(i);
                System.out.println(i + " is the indeex");
            }
        }

        ObjectOutputStream userListStream = new ObjectOutputStream(new FileOutputStream(file));
        userListStream.writeObject(users);
        userListStream.close();

    }

    public static void changeUserName(String oldUsername, String newUsername) {

        ArrayList<User> users = new ArrayList<User>();
        File file = new File("UserList.bin");

        if (file.exists()) {

            try {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                users = (ArrayList) reader.readObject();
                file.delete();

                for (User user : users) {
                    if (user.getName().equals(oldUsername)) {
                        user.setName(newUsername);
                        System.out.println(" is the index");
                    }
                }
                ObjectOutputStream userListStream = new ObjectOutputStream(new FileOutputStream(file));
                userListStream.writeObject(users);
                userListStream.close();

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }

    }

    public static void changePassword(String username, String newPassword) {

        ArrayList<User> users = new ArrayList<User>();
        File file = new File("UserList.bin");

        if (file.exists()) {

            try {

                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                users = (ArrayList) reader.readObject();
                for (User user : users) {
                    if (user.getName().equals(username)) {
                        user.setPassword(newPassword);
                        file.delete();
                        System.out.println("is theeee indeex");
                    }
                }

                ObjectOutputStream userListStream = new ObjectOutputStream(new FileOutputStream(file));
                userListStream.writeObject(users);
                userListStream.close();

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }

    }

}
