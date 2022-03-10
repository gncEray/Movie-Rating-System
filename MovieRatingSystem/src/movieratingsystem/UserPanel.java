package movieratingsystem;

import cinemaWorkers.BackStage;
import cinemaWorkers.CinemaWorker;
import cinemaWorkers.DownStage;
import classes.SystemClass;
import userAndEditor.User;
import static java.awt.Label.CENTER;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import movieClasses.Film;
import movieClasses.Movie;
import movieClasses.Series;
import userAndEditor.MemberManager;

public class UserPanel extends javax.swing.JFrame {

    User user;
    Movie searchedMovie;
    CinemaWorker searchedPerson;

    public UserPanel() {
        initComponents();
        jButton1.setVisible(false);
    }

    public UserPanel(User user) {
        initComponents();
        jButton1.setVisible(false);
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        bg2 = new javax.swing.ButtonGroup();
        bg3 = new javax.swing.ButtonGroup();
        bg4 = new javax.swing.ButtonGroup();
        bg5 = new javax.swing.ButtonGroup();
        bg6 = new javax.swing.ButtonGroup();
        bg7 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        userEnterance = new javax.swing.JPanel();
        jListAllMovies = new javax.swing.JLabel();
        jListMoviesWithGenre = new javax.swing.JLabel();
        jListAllPeople = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        listAllMovies = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelAllFilms = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAllFilms = new javax.swing.JTable();
        panelAllSeries = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableAllSeries = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        listWithGenre = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        cbGenre = new javax.swing.JComboBox<>();
        btListWithGenre = new javax.swing.JButton();
        rbFilmGenre = new javax.swing.JRadioButton();
        rbSeriesGenre = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableMovieGenre = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        listAllPeople = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAllActors = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableAllBackStage = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel18 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        lpInfo = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        userSettings = new javax.swing.JPanel();
        rbMyList = new javax.swing.JRadioButton();
        rbDeleteAccount = new javax.swing.JRadioButton();
        rbChangePassword = new javax.swing.JRadioButton();
        rbChangeUsername = new javax.swing.JRadioButton();
        rbMyScores = new javax.swing.JRadioButton();
        rbMyReviews = new javax.swing.JRadioButton();
        jButton8 = new javax.swing.JButton();
        lp2 = new javax.swing.JLayeredPane();
        userInfo = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        myList = new javax.swing.JPanel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        myListFilm = new javax.swing.JScrollPane();
        tableMyListFilm = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableMyListSeries = new javax.swing.JTable();
        myScores = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taMyScores = new javax.swing.JTextArea();
        myReviews = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        changeUsername = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btChangeUsername = new javax.swing.JButton();
        changePassword = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btChangePassword = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        deleteAccount = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USER");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        userEnterance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListAllMovies.setFont(new java.awt.Font("Inter Medium", 1, 18)); // NOI18N
        jListAllMovies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jListAllMovies.setText("List all Movies");
        jListAllMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAllMoviesMouseClicked(evt);
            }
        });
        userEnterance.add(jListAllMovies, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 100, 180, 70));

        jListMoviesWithGenre.setFont(new java.awt.Font("Inter", 1, 16)); // NOI18N
        jListMoviesWithGenre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jListMoviesWithGenre.setText("List Movies with Genre");
        jListMoviesWithGenre.setToolTipText("go to all movies");
        jListMoviesWithGenre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMoviesWithGenreMouseClicked(evt);
            }
        });
        userEnterance.add(jListMoviesWithGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 523, 180, 70));

        jListAllPeople.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jListAllPeople.setForeground(new java.awt.Color(240, 240, 240));
        jListAllPeople.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jListAllPeople.setText("List all People");
        jListAllPeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAllPeopleMouseClicked(evt);
            }
        });
        userEnterance.add(jListAllPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 450, 190, 70));

        jTextField1.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        jTextField1.setText("Enter a movie, series or a person");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        userEnterance.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 350, 30));

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        userEnterance.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, 30));

        jLabel15.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("My Account");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        userEnterance.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 180, 70));

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton15.setText("BACK");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        userEnterance.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 640, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpanelitems/User Research Resources (Community) (2).png"))); // NOI18N
        userEnterance.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        jLayeredPane1.add(userEnterance, "card3");

        listAllMovies.setMaximumSize(new java.awt.Dimension(1280, 720));
        listAllMovies.setMinimumSize(new java.awt.Dimension(1280, 720));
        listAllMovies.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        listAllMovies.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, -1, -1));

        bg1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton8.setText("Film");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        listAllMovies.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, -1));

        bg1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton9.setText("Series");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        listAllMovies.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 280, 100, -1));

        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, "card4");

        tableAllFilms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Film Rank", "Title", "Genre", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAllFilms.getTableHeader().setReorderingAllowed(false);
        tableAllFilms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAllFilmsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAllFilms);
        if (tableAllFilms.getColumnModel().getColumnCount() > 0) {
            tableAllFilms.getColumnModel().getColumn(0).setResizable(false);
            tableAllFilms.getColumnModel().getColumn(1).setResizable(false);
            tableAllFilms.getColumnModel().getColumn(2).setResizable(false);
            tableAllFilms.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panelAllFilmsLayout = new javax.swing.GroupLayout(panelAllFilms);
        panelAllFilms.setLayout(panelAllFilmsLayout);
        panelAllFilmsLayout.setHorizontalGroup(
            panelAllFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        panelAllFilmsLayout.setVerticalGroup(
            panelAllFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        jPanel1.add(panelAllFilms, "card2");

        tableAllSeries.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        tableAllSeries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Series Rank", "Title", "Genre", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAllSeries.getTableHeader().setReorderingAllowed(false);
        tableAllSeries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAllSeriesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableAllSeries);
        if (tableAllSeries.getColumnModel().getColumnCount() > 0) {
            tableAllSeries.getColumnModel().getColumn(0).setResizable(false);
            tableAllSeries.getColumnModel().getColumn(1).setResizable(false);
            tableAllSeries.getColumnModel().getColumn(2).setResizable(false);
            tableAllSeries.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panelAllSeriesLayout = new javax.swing.GroupLayout(panelAllSeries);
        panelAllSeries.setLayout(panelAllSeriesLayout);
        panelAllSeriesLayout.setHorizontalGroup(
            panelAllSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        panelAllSeriesLayout.setVerticalGroup(
            panelAllSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        jPanel1.add(panelAllSeries, "card3");

        listAllMovies.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 740, 350));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpanelitems/JMPA3w.jpg"))); // NOI18N
        listAllMovies.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLayeredPane1.add(listAllMovies, "card5");

        listWithGenre.setMaximumSize(new java.awt.Dimension(1280, 720));
        listWithGenre.setMinimumSize(new java.awt.Dimension(1280, 720));
        listWithGenre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Inter SemiBold", 0, 12)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        listWithGenre.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, -1, -1));

        cbGenre.setFont(new java.awt.Font("Inter SemiBold", 0, 18)); // NOI18N
        cbGenre.setMaximumRowCount(16);
        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Biography", "Comedy", "Drama", "Documentary", "Fantasy", "Horror", "Mystery", "Romance", "Science-Fiction", "Thriller", "Western" }));
        cbGenre.setSelectedIndex(-1);
        listWithGenre.add(cbGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 150, -1));

        btListWithGenre.setFont(new java.awt.Font("Inter SemiBold", 0, 12)); // NOI18N
        btListWithGenre.setText("SHOW");
        btListWithGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListWithGenreActionPerformed(evt);
            }
        });
        listWithGenre.add(btListWithGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 150, -1));

        bg2.add(rbFilmGenre);
        rbFilmGenre.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        rbFilmGenre.setForeground(new java.awt.Color(240, 240, 240));
        rbFilmGenre.setText("Film");
        listWithGenre.add(rbFilmGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, -1));

        bg2.add(rbSeriesGenre);
        rbSeriesGenre.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        rbSeriesGenre.setForeground(new java.awt.Color(240, 240, 240));
        rbSeriesGenre.setText("Series");
        listWithGenre.add(rbSeriesGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 280, 100, -1));

        tableMovieGenre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rank", "Title", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMovieGenre.getTableHeader().setReorderingAllowed(false);
        tableMovieGenre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMovieGenreMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tableMovieGenre);
        if (tableMovieGenre.getColumnModel().getColumnCount() > 0) {
            tableMovieGenre.getColumnModel().getColumn(0).setResizable(false);
            tableMovieGenre.getColumnModel().getColumn(1).setResizable(false);
            tableMovieGenre.getColumnModel().getColumn(2).setResizable(false);
        }

        listWithGenre.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 740, 350));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpanelitems/JMPA3w.jpg"))); // NOI18N
        listWithGenre.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLayeredPane1.add(listWithGenre, "card7");

        listAllPeople.setMaximumSize(new java.awt.Dimension(1280, 720));
        listAllPeople.setMinimumSize(new java.awt.Dimension(1280, 720));
        listAllPeople.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        listAllPeople.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, -1, -1));

        bg3.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton10.setText("Back Stage");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        listAllPeople.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280, 160, -1));

        bg3.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton12.setText("Actor");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        listAllPeople.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 160, -1));

        jPanel5.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel14, "card4");

        tableAllActors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actor Rank", "Name", "Job", "Nationality", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAllActors.getTableHeader().setReorderingAllowed(false);
        tableAllActors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAllActorsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableAllActors);
        if (tableAllActors.getColumnModel().getColumnCount() > 0) {
            tableAllActors.getColumnModel().getColumn(0).setResizable(false);
            tableAllActors.getColumnModel().getColumn(1).setResizable(false);
            tableAllActors.getColumnModel().getColumn(2).setResizable(false);
            tableAllActors.getColumnModel().getColumn(3).setResizable(false);
            tableAllActors.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, "card2");

        tableAllBackStage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BackStage Rank", "Name", "Job", "Nationality", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAllBackStage.getTableHeader().setReorderingAllowed(false);
        tableAllBackStage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAllBackStageMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableAllBackStage);
        if (tableAllBackStage.getColumnModel().getColumnCount() > 0) {
            tableAllBackStage.getColumnModel().getColumn(0).setResizable(false);
            tableAllBackStage.getColumnModel().getColumn(1).setResizable(false);
            tableAllBackStage.getColumnModel().getColumn(2).setResizable(false);
            tableAllBackStage.getColumnModel().getColumn(3).setResizable(false);
            tableAllBackStage.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, "card3");

        listAllPeople.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 730, 350));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpanelitems/JMPA3w.jpg"))); // NOI18N
        listAllPeople.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLayeredPane1.add(listAllPeople, "card8");

        searchPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
        searchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        searchPanel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, -1, -1));

        jButton10.setText("Add Score");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Add Review");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(9);
        jSlider1.setPaintTicks(true);

        jLabel18.setFont(new java.awt.Font("Inter SemiBold", 0, 12)); // NOI18N
        jLabel18.setText("1      2     3     4     5     6     7     8     9     10");

        jButton12.setText("Add to My List");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea2);

        jButton6.setText("See All Reviews");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lpInfo.setLayout(new java.awt.CardLayout());

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane8.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        lpInfo.add(jPanel3, "card2");

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane9.setViewportView(jTextArea6);

        jButton13.setText("Back to Information");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jButton13)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        lpInfo.add(jPanel15, "card3");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lpInfo)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addGap(17, 17, 17)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)))
                .addContainerGap())
        );

        searchPanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 730, 350));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpanelitems/JMPA3w.jpg"))); // NOI18N
        searchPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLayeredPane1.add(searchPanel, "card7");

        userSettings.setMaximumSize(new java.awt.Dimension(1280, 720));
        userSettings.setMinimumSize(new java.awt.Dimension(1280, 720));
        userSettings.setPreferredSize(new java.awt.Dimension(1280, 720));
        userSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userSettingsMouseClicked(evt);
            }
        });
        userSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg4.add(rbMyList);
        rbMyList.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        rbMyList.setForeground(new java.awt.Color(240, 240, 240));
        rbMyList.setText("My List");
        rbMyList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMyListActionPerformed(evt);
            }
        });
        userSettings.add(rbMyList, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 150, -1));

        bg4.add(rbDeleteAccount);
        rbDeleteAccount.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        rbDeleteAccount.setForeground(new java.awt.Color(240, 240, 240));
        rbDeleteAccount.setText("Delete Account");
        rbDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDeleteAccountActionPerformed(evt);
            }
        });
        userSettings.add(rbDeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 200, -1));

        bg4.add(rbChangePassword);
        rbChangePassword.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        rbChangePassword.setForeground(new java.awt.Color(240, 240, 240));
        rbChangePassword.setText("Change Password");
        rbChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChangePasswordActionPerformed(evt);
            }
        });
        userSettings.add(rbChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, -1));

        bg4.add(rbChangeUsername);
        rbChangeUsername.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        rbChangeUsername.setForeground(new java.awt.Color(240, 240, 240));
        rbChangeUsername.setText("Change Username");
        rbChangeUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChangeUsernameActionPerformed(evt);
            }
        });
        userSettings.add(rbChangeUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, -1));

        bg4.add(rbMyScores);
        rbMyScores.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        rbMyScores.setForeground(new java.awt.Color(240, 240, 240));
        rbMyScores.setText("My Scores");
        rbMyScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMyScoresActionPerformed(evt);
            }
        });
        userSettings.add(rbMyScores, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, -1));

        bg4.add(rbMyReviews);
        rbMyReviews.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        rbMyReviews.setForeground(new java.awt.Color(240, 240, 240));
        rbMyReviews.setText("My Reviews");
        rbMyReviews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMyReviewsActionPerformed(evt);
            }
        });
        userSettings.add(rbMyReviews, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        jButton8.setText("BACK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        userSettings.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, -1, -1));

        lp2.setLayout(new java.awt.CardLayout());

        jLabel26.setFont(new java.awt.Font("Inter SemiBold", 0, 36)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("USER SETTINGS");

        javax.swing.GroupLayout userInfoLayout = new javax.swing.GroupLayout(userInfo);
        userInfo.setLayout(userInfoLayout);
        userInfoLayout.setHorizontalGroup(
            userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        userInfoLayout.setVerticalGroup(
            userInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        lp2.add(userInfo, "card2");

        bg5.add(jRadioButton14);
        jRadioButton14.setText("Films");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        bg5.add(jRadioButton15);
        jRadioButton15.setText("Series");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        jPanel16.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel2, "card4");

        tableMyListFilm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Film Title", "Genre", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMyListFilm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMyListFilmMouseClicked(evt);
            }
        });
        myListFilm.setViewportView(tableMyListFilm);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myListFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myListFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel17, "card2");

        tableMyListSeries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Series Title", "Genre", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMyListSeries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMyListSeriesMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tableMyListSeries);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel18, "card3");

        javax.swing.GroupLayout myListLayout = new javax.swing.GroupLayout(myList);
        myList.setLayout(myListLayout);
        myListLayout.setHorizontalGroup(
            myListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myListLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jRadioButton14)
                .addGap(119, 119, 119)
                .addComponent(jRadioButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(myListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        myListLayout.setVerticalGroup(
            myListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15))
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lp2.add(myList, "card3");

        taMyScores.setEditable(false);
        taMyScores.setColumns(20);
        taMyScores.setRows(5);
        jScrollPane3.setViewportView(taMyScores);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout myScoresLayout = new javax.swing.GroupLayout(myScores);
        myScores.setLayout(myScoresLayout);
        myScoresLayout.setHorizontalGroup(
            myScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        myScoresLayout.setVerticalGroup(
            myScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lp2.add(myScores, "card2");

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Reviews");
        jScrollPane12.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout myReviewsLayout = new javax.swing.GroupLayout(myReviews);
        myReviews.setLayout(myReviewsLayout);
        myReviewsLayout.setHorizontalGroup(
            myReviewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        myReviewsLayout.setVerticalGroup(
            myReviewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lp2.add(myReviews, "card2");

        jLabel19.setFont(new java.awt.Font("Inter Medium", 0, 24)); // NOI18N
        jLabel19.setText("Old Username");

        jLabel20.setFont(new java.awt.Font("Inter Medium", 0, 24)); // NOI18N
        jLabel20.setText("New Username");

        btChangeUsername.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        btChangeUsername.setText("CHANGE");
        btChangeUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChangeUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel19))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel20))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btChangeUsername)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btChangeUsername)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout changeUsernameLayout = new javax.swing.GroupLayout(changeUsername);
        changeUsername.setLayout(changeUsernameLayout);
        changeUsernameLayout.setHorizontalGroup(
            changeUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        changeUsernameLayout.setVerticalGroup(
            changeUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lp2.add(changeUsername, "card2");

        jLabel21.setFont(new java.awt.Font("Inter Medium", 0, 24)); // NOI18N
        jLabel21.setText("Old Password");

        jLabel22.setFont(new java.awt.Font("Inter Medium", 0, 24)); // NOI18N
        jLabel22.setText("New Password");

        btChangePassword.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        btChangePassword.setText("CHANGE");
        btChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel21))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btChangePassword))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2))))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btChangePassword)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout changePasswordLayout = new javax.swing.GroupLayout(changePassword);
        changePassword.setLayout(changePasswordLayout);
        changePasswordLayout.setHorizontalGroup(
            changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        changePasswordLayout.setVerticalGroup(
            changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lp2.add(changePassword, "card2");

        jLabel23.setFont(new java.awt.Font("Inter Medium", 0, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Username");

        jLabel24.setFont(new java.awt.Font("Inter Medium", 0, 24)); // NOI18N
        jLabel24.setText("Password");

        jButton16.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jButton16.setText("DELETE");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(309, 309, 309))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(312, 312, 312))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(306, 306, 306))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jPasswordField3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout deleteAccountLayout = new javax.swing.GroupLayout(deleteAccount);
        deleteAccount.setLayout(deleteAccountLayout);
        deleteAccountLayout.setHorizontalGroup(
            deleteAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deleteAccountLayout.setVerticalGroup(
            deleteAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lp2.add(deleteAccount, "card2");

        userSettings.add(lp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 730, 350));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpanelitems/JMPA3w.jpg"))); // NOI18N
        userSettings.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLayeredPane1.add(userSettings, "card8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        jButton1.setVisible(true);

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jListAllMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAllMoviesMouseClicked
        // LIST ALL MOVIES

        DefaultTableModel films = (DefaultTableModel) tableAllFilms.getModel();
        int rowCount = films.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            films.removeRow(i);
        }

        File fileFilm = new File("FilmList.bin");
        ArrayList<Film> filmlist = new ArrayList<>();

        try {
            if (fileFilm.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileFilm));
                filmlist = (ArrayList<Film>) ois.readObject();
            }
            int i = 1;

            if (filmlist == null) {
                System.out.println("filmlist is null");
            } else {
                for (Film film : filmlist) {

                    int data1 = i++;
                    String data2 = film.getTitle();
                    String data3 = film.getGenre();
                    double data4 = film.getUserScore();

                    Object[] row = {data1, data2, data3, data4};
                    DefaultTableModel model = (DefaultTableModel) tableAllFilms.getModel();
                    model.addRow(row);

                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        //SERIES
        DefaultTableModel series = (DefaultTableModel) tableAllSeries.getModel();
        int rowCountSeries = series.getRowCount();
        for (int i = rowCountSeries - 1; i >= 0; i--) {
            series.removeRow(i);
        }

        File fileSeries = new File("SeriesList.bin");
        ArrayList<Series> serieslist = new ArrayList<>();

        try {
            if (fileSeries.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileSeries));
                serieslist = (ArrayList<Series>) ois.readObject();
            }

            int i = 1;

            if (serieslist == null) {
                System.out.println("serieslist is null");
            } else {
                for (Series tvseries : serieslist) {

                    int data1 = i++;
                    String data2 = tvseries.getTitle();
                    String data3 = tvseries.getGenre();
                    double data4 = tvseries.getUserScore();

                    Object[] row = {data1, data2, data3, data4};
                    DefaultTableModel model = (DefaultTableModel) tableAllSeries.getModel();
                    model.addRow(row);

                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLayeredPane1.removeAll();
        jLayeredPane1.add(listAllMovies);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();

    }//GEN-LAST:event_jListAllMoviesMouseClicked

    private void jListMoviesWithGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMoviesWithGenreMouseClicked
        // TODO add your handling code here:

        jLayeredPane1.removeAll();
        jLayeredPane1.add(listWithGenre);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
    }//GEN-LAST:event_jListMoviesWithGenreMouseClicked

    private void jListAllPeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAllPeopleMouseClicked
        // fill tables here

        DefaultTableModel dmds = (DefaultTableModel) tableAllActors.getModel();
        int rowCount = dmds.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dmds.removeRow(i);
        }

        File fileds = new File("DownStageList.bin");
        ArrayList<DownStage> dslist = new ArrayList<>();

        try {
            if (fileds.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileds));
                dslist = (ArrayList<DownStage>) ois.readObject();
            }
            int i = 1;

            if (dslist == null) {
                System.out.println("downstagelist is null");
            } else {
                for (DownStage downStage : dslist) {

                    int data1 = i++;
                    String data2 = downStage.getName();
                    String data3 = downStage.getJob();
                    String data4 = downStage.getNationality();
                    double data5 = downStage.getPersonScore();

                    Object[] row = {data1, data2, data3, data4, data5};
                    DefaultTableModel model = (DefaultTableModel) tableAllActors.getModel();
                    model.addRow(row);

                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        //BackStage 
        DefaultTableModel dmbs = (DefaultTableModel) tableAllBackStage.getModel();
        int rowCountbs = dmbs.getRowCount();
        for (int i = rowCountbs - 1; i >= 0; i--) {
            dmbs.removeRow(i);
        }

        File filebs = new File("BackStageList.bin");
        ArrayList<BackStage> bslist = new ArrayList<>();
        tableAllBackStage.removeAll();
        try {
            if (filebs.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filebs));
                bslist = (ArrayList<BackStage>) ois.readObject();
            }
            int i = 1;

            if (bslist == null) {
                System.out.println("backstage list is null");
            } else {
                for (BackStage backstage : bslist) {

                    int data1 = i++;
                    String data2 = backstage.getName();
                    String data3 = backstage.getJob();
                    String data4 = backstage.getNationality();
                    double data5 = backstage.getPersonScore();

                    Object[] row = {data1, data2, data3, data4, data5};
                    DefaultTableModel model = (DefaultTableModel) tableAllBackStage.getModel();
                    model.addRow(row);

                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLayeredPane1.removeAll();
        jLayeredPane1.add(listAllPeople);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
    }//GEN-LAST:event_jListAllPeopleMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // search 
        String str = "";
        String name = jTextField1.getText();

        try {
            searchedPerson = SystemClass.searchCinemaWorker(name);
            searchedMovie = SystemClass.searchMovie(name);

            if (searchedPerson != null) {
                str += SystemClass.displayCinemaWorker(searchedPerson);
                jButton12.setVisible(false);
                jTextArea3.setText(str);
                jLayeredPane1.removeAll();
                jLayeredPane1.add(searchPanel);
                jLayeredPane1.revalidate();
                jLayeredPane1.repaint();
            } else if (searchedMovie != null) {
                str += SystemClass.displayMovie(searchedMovie);
                jButton12.setVisible(true);
                jTextArea3.setText(str);
                jLayeredPane1.removeAll();
                jLayeredPane1.add(searchPanel);
                jLayeredPane1.revalidate();
                jLayeredPane1.repaint();
            } else {
                JOptionPane.showMessageDialog(rootPane, "There is no such a person or movie!");
            }

        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(userEnterance);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(userEnterance);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(userEnterance);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
        jPanel5.removeAll();
        jPanel5.add(jPanel7);
        jPanel5.revalidate();
        jPanel5.repaint();
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(userEnterance);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
        
        lpInfo.removeAll();
        lpInfo.add(jPanel3);
        lpInfo.revalidate();
        lpInfo.repaint();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(userSettings);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();

        jLabel26.setText("<html>Hello " + user.getName() + ",<br>Here your CINELAND account information.<br>Select what do you want to do or see." + user.getUserId());

    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jLayeredPane1.removeAll();
        jLayeredPane1.add(userEnterance);
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
        
        lp2.removeAll();
        lp2.add(userInfo);
        lp2.revalidate();
        lp2.repaint();
        
        bg4.clearSelection();
                
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.add(panelAllFilms);
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.add(panelAllSeries);
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // add to my List
        boolean flag = true;
        try {
            System.out.println("bu yazıyor: " + searchedMovie.getTitle());
            if (searchedMovie != null) {
                flag = user.addSavedMovies(searchedMovie);
                if (flag) {
                    JOptionPane.showMessageDialog(rootPane, "added successfully");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "already added!");
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void rbMyListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMyListActionPerformed
        // myList show
        //jtable2 = films
        //jtable 3 series

        try {
            ArrayList<Film> savedFilms = user.getSavedFilms();
            DefaultTableModel dmfilm = (DefaultTableModel) tableMyListFilm.getModel();
            int rowCountFilm = dmfilm.getRowCount();
            for (int i = rowCountFilm - 1; i >= 0; i--) {
                dmfilm.removeRow(i);
            }

            if (savedFilms == null) {
                System.out.println("savedFilms is null");
            } else {
                for (Film film : savedFilms) {

                    String data1 = film.getTitle();
                    String data2 = film.getGenre();
                    double data3 = film.getUserScore();

                    Object[] row = {data1, data2, data3};
                    DefaultTableModel model = (DefaultTableModel) tableMyListFilm.getModel();
                    model.addRow(row);

                }
            }

            //Series
            ArrayList<Series> savedSeries = user.getSavedSeries();
            DefaultTableModel dmseries = (DefaultTableModel) tableMyListSeries.getModel();
            int rowCountSeries = dmseries.getRowCount();
            for (int i = rowCountSeries - 1; i >= 0; i--) {
                dmseries.removeRow(i);
            }

            if (savedSeries == null) {
                System.out.println("savedSeries is null");
            } else {
                for (Series series : savedSeries) {

                    String data1 = series.getTitle();
                    String data2 = series.getGenre();
                    double data3 = series.getUserScore();

                    Object[] row = {data1, data2, data3};
                    DefaultTableModel model = (DefaultTableModel) tableMyListSeries.getModel();
                    model.addRow(row);

                }
            }

        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        lp2.removeAll();
        lp2.add(myList);
        lp2.revalidate();
        lp2.repaint();
    }//GEN-LAST:event_rbMyListActionPerformed

    private void rbMyReviewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMyReviewsActionPerformed
        // TODO add your handling code here:
        jTextArea4.setText("");
        
        String allMyReviews = "";
        try {
            allMyReviews = user.getReviews();
        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextArea4.setText(allMyReviews);
        
        lp2.removeAll();
        lp2.add(myReviews);
        lp2.revalidate();
        lp2.repaint();
    }//GEN-LAST:event_rbMyReviewsActionPerformed

    private void rbMyScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMyScoresActionPerformed
        // TODO add your handling code here:
        
        taMyScores.setText("");
        String allMyScores = "";
        
        try {
            allMyScores = user.getScores();
        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        taMyScores.setText(allMyScores);
        
        lp2.removeAll();
        lp2.add(myScores);
        lp2.revalidate();
        lp2.repaint();
    }//GEN-LAST:event_rbMyScoresActionPerformed

    private void rbChangeUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChangeUsernameActionPerformed
        // TODO add your handling code here:
        lp2.removeAll();
        lp2.add(changeUsername);
        lp2.revalidate();
        lp2.repaint();
    }//GEN-LAST:event_rbChangeUsernameActionPerformed

    private void rbChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChangePasswordActionPerformed
        // TODO add your handling code here:
        lp2.removeAll();
        lp2.add(changePassword);
        lp2.revalidate();
        lp2.repaint();
    }//GEN-LAST:event_rbChangePasswordActionPerformed

    private void rbDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDeleteAccountActionPerformed
        // TODO add your handling code here:
        lp2.removeAll();
        lp2.add(deleteAccount);
        lp2.revalidate();
        lp2.repaint();
    }//GEN-LAST:event_rbDeleteAccountActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
        jPanel16.removeAll();
        jPanel16.add(jPanel17);
        jPanel16.revalidate();
        jPanel16.repaint();
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
        jPanel16.removeAll();
        jPanel16.add(jPanel18);
        jPanel16.revalidate();
        jPanel16.repaint();
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:

        jPanel5.removeAll();
        jPanel5.add(jPanel6);
        jPanel5.revalidate();
        jPanel5.repaint();
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        EnteranceScreen e;
        try {
            e = new EnteranceScreen();
            e.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton15ActionPerformed

    private void btChangeUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChangeUsernameActionPerformed

        if (!jTextField5.getText().equals(user.getName())) {
            JOptionPane.showMessageDialog(rootPane, "Username is wrong");
        } else {

            String oldUsername = user.getName();
            String newUsername = jTextField4.getText();

            try {

                MemberManager.changeUserName(oldUsername, newUsername);

                JOptionPane.showMessageDialog(rootPane, "SIGN IN AGAIN", "CHANGED SUCCESSFULLY!", 1);
                EnteranceScreen es = new EnteranceScreen();
                es.setVisible(true);
                this.setVisible(false);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btChangeUsernameActionPerformed


    private void btChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChangePasswordActionPerformed

        if (!jPasswordField1.getText().equals(user.getPassword())) {
            JOptionPane.showMessageDialog(rootPane, "Password is wrong");
        } else {

            String username = user.getName();
            String newPassword = jPasswordField2.getText();

            try {

                MemberManager.changePassword(username, newPassword);

                JOptionPane.showMessageDialog(rootPane, "SIGN IN AGAIN", "CHANGED SUCCESSFULLY!", 1);
                EnteranceScreen es = new EnteranceScreen();
                es.setVisible(true);
                this.setVisible(false);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btChangePasswordActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // delete account
        String name = user.getName();
        if (!jPasswordField3.getText().equals(user.getPassword()) || !jTextField8.getText().equals(user.getName())) {
            JOptionPane.showMessageDialog(rootPane, "Name or Password is wrong");
        } else {

            try {
                MemberManager.deleteAccount(name);

                JOptionPane.showMessageDialog(rootPane, "GOODBYE " + name, "DELETED SUCCESSFULLY!", 1);
                EnteranceScreen es = new EnteranceScreen();
                es.setVisible(true);
                this.setVisible(false);

            } catch (IOException ex) {
                Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // add score 

        try {
            int score = jSlider1.getValue() + 1;
            if(searchedMovie != null)
            {
                user.addScore(user.getName() ,searchedMovie, score);
                searchedMovie.addUserScore(score);
            }
            
            
            
                
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void tableAllActorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAllActorsMouseClicked
        // TODO add your handling code here:
        int i = tableAllActors.getSelectedRow();
        int j = tableAllActors.getSelectedColumn();
        String name = (String) tableAllActors.getValueAt(i, 1);
        String str = "";
        try {
            CinemaWorker actor = SystemClass.searchCinemaWorker(name);
            if (actor != null) {
                str += SystemClass.displayCinemaWorker(actor);
                jButton12.setVisible(false);
                jTextArea3.setText(str);
                jLayeredPane1.removeAll();
                jLayeredPane1.add(searchPanel);
                jLayeredPane1.revalidate();
                jLayeredPane1.repaint();
            }

        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableAllActorsMouseClicked

    private void tableAllBackStageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAllBackStageMouseClicked
        // TODO add your handling code here:

        int i = tableAllBackStage.getSelectedRow();
        int j = tableAllBackStage.getSelectedColumn();
        String name = (String) tableAllBackStage.getValueAt(i, 1);
        String str = "";
        try {
            CinemaWorker backStage = SystemClass.searchCinemaWorker(name);
            if (backStage != null) {
                str += SystemClass.displayCinemaWorker(backStage);
                jButton12.setVisible(false);
                jTextArea3.setText(str);
                jLayeredPane1.removeAll();
                jLayeredPane1.add(searchPanel);
                jLayeredPane1.revalidate();
                jLayeredPane1.repaint();
            }

        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tableAllBackStageMouseClicked

    private void tableAllFilmsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAllFilmsMouseClicked
        // TODO add your handling code here:

        int i = tableAllFilms.getSelectedRow();
        int j = tableAllFilms.getSelectedColumn();
        String title = (String) tableAllFilms.getValueAt(i, 1);
        String str = "";
        try {
            searchedMovie = SystemClass.searchMovie(title);
            if (searchedMovie != null) {
                str += SystemClass.displayMovie(searchedMovie);
                jButton12.setVisible(true);
                jTextArea3.setText(str);
                jLayeredPane1.removeAll();
                jLayeredPane1.add(searchPanel);
                jLayeredPane1.revalidate();
                jLayeredPane1.repaint();
            }

        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableAllFilmsMouseClicked

    private void tableAllSeriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAllSeriesMouseClicked

        int i = tableAllSeries.getSelectedRow();
        int j = tableAllSeries.getSelectedColumn();
        String title = (String) tableAllSeries.getValueAt(i, 1);
        String str = "";
        try {
            searchedMovie = SystemClass.searchMovie(title);
            if (searchedMovie != null) {
                str += SystemClass.displayMovie(searchedMovie);
                jButton12.setVisible(true);
                jTextArea3.setText(str);
                jLayeredPane1.removeAll();
                jLayeredPane1.add(searchPanel);
                jLayeredPane1.revalidate();
                jLayeredPane1.repaint();
            }

        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableAllSeriesMouseClicked

    private void btListWithGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListWithGenreActionPerformed

        String genre = "" + cbGenre.getSelectedItem();

        if (rbFilmGenre.isSelected()) {
            //Film

            DefaultTableModel films = (DefaultTableModel) tableMovieGenre.getModel();
            int rowCount = films.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                films.removeRow(i);
            }

            File fileFilm = new File("FilmList.bin");
            ArrayList<Film> filmlist = new ArrayList<>();
            ArrayList<Film> filmlistGenre = new ArrayList<>();

            if (fileFilm.exists()) {
                ObjectInputStream ois;
                try {
                    ois = new ObjectInputStream(new FileInputStream(fileFilm));
                    filmlist = (ArrayList<Film>) ois.readObject();

                    if (filmlist != null) {
                        for (Film film : filmlist) {
                            if (film.getGenre().equals(genre)) {
                                filmlistGenre.add(film);
                            }
                        }
                    }

                    if (filmlistGenre == null) {
                        System.out.println("filmlistGenre is null");
                    } else {
                        int i = 1;
                        for (Film film : filmlistGenre) {
                            int data1 = i++;
                            String data2 = film.getTitle();
                            double data3 = film.getUserScore();

                            Object[] row = {data1, data2, data3};
                            DefaultTableModel model = (DefaultTableModel) tableMovieGenre.getModel();
                            model.addRow(row);
                        }
                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } else if (rbSeriesGenre.isSelected()) {
            //series

            DefaultTableModel films = (DefaultTableModel) tableMovieGenre.getModel();
            int rowCount = films.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                films.removeRow(i);
            }

            File fileSeries = new File("SeriesList.bin");
            ArrayList<Series> serieslist = new ArrayList<>();
            ArrayList<Series> serieslistGenre = new ArrayList<>();

            if (fileSeries.exists()) {
                ObjectInputStream ois;
                try {
                    ois = new ObjectInputStream(new FileInputStream(fileSeries));
                    serieslist = (ArrayList<Series>) ois.readObject();

                    if (serieslist != null) {
                        for (Series series : serieslist) {
                            if (series.getGenre().equals(genre)) {
                                serieslistGenre.add(series);
                            }
                        }
                    }

                    if (serieslistGenre == null) {
                        System.out.println("serieslistGenre is null");
                    } else {
                        int i = 1;
                        for (Series series : serieslistGenre) {
                            int data1 = i++;
                            String data2 = series.getTitle();
                            double data3 = series.getUserScore();

                            Object[] row = {data1, data2, data3};
                            DefaultTableModel model = (DefaultTableModel) tableMovieGenre.getModel();
                            model.addRow(row);
                        }
                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }


    }//GEN-LAST:event_btListWithGenreActionPerformed

    private void tableMovieGenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMovieGenreMouseClicked

        int i = tableMovieGenre.getSelectedRow();
        int j = tableMovieGenre.getSelectedColumn();
        String title = (String) tableMovieGenre.getValueAt(i, 1);
        String str = "";
        try {
            Movie movie = SystemClass.searchMovie(title);
            if (movie != null) {
                str += SystemClass.displayMovie(movie);
                jButton12.setVisible(true);
                jTextArea3.setText(str);
                jLayeredPane1.removeAll();
                jLayeredPane1.add(searchPanel);
                jLayeredPane1.revalidate();
                jLayeredPane1.repaint();
            }

        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tableMovieGenreMouseClicked

    private void userSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSettingsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userSettingsMouseClicked

    private void tableMyListFilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMyListFilmMouseClicked
        // TODO add your handling code here:

        int i = tableMyListFilm.getSelectedRow();
        int j = tableMyListFilm.getSelectedColumn();
        String title = (String) tableMyListFilm.getValueAt(i, 0);
        String str = "";
        try {
            searchedMovie = SystemClass.searchMovie(title);
            if (searchedMovie != null) {
                str += SystemClass.displayMovie(searchedMovie);
                jButton12.setVisible(true);
                jTextArea3.setText(str);
                jLayeredPane1.removeAll();
                jLayeredPane1.add(searchPanel);
                jLayeredPane1.revalidate();
                jLayeredPane1.repaint();
            }

        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableMyListFilmMouseClicked

    private void tableMyListSeriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMyListSeriesMouseClicked

        int i = tableMyListSeries.getSelectedRow();
        int j = tableMyListSeries.getSelectedColumn();
        String title = (String) tableMyListSeries.getValueAt(i, 0);
        String str = "";
        try {
            searchedMovie = SystemClass.searchMovie(title);
            if (searchedMovie != null) {
                str += SystemClass.displayMovie(searchedMovie);
                jButton12.setVisible(true);
                jTextArea3.setText(str);
                jLayeredPane1.removeAll();
                jLayeredPane1.add(searchPanel);
                jLayeredPane1.revalidate();
                jLayeredPane1.repaint();
            }

        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableMyListSeriesMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        String str = "";
        
        if(searchedMovie != null)
            str = searchedMovie.getUserReview();
        if(searchedPerson != null)
            str = searchedPerson.getPersonReview();
        
        if(str.equals(""))
        {
            jTextArea6.setText("Nobody has added review yet.");
        }
        else {
            jTextArea6.setText(str);
        }
        
        
        lpInfo.removeAll();
        lpInfo.add(jPanel15);
        lpInfo.repaint();
        lpInfo.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        lpInfo.removeAll();
        lpInfo.add(jPanel3);
        lpInfo.repaint();
        lpInfo.revalidate();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // add review
        
        String review = jTextArea2.getText();
        
        try {            
            if(searchedMovie != null) {
                searchedMovie.setUserReview(user, review);
                user.addReview(searchedMovie.getTitle() + ": " + review + "\n\n");                
            }
            
            if(searchedPerson != null) {
                searchedPerson.addReview(user, review);
                user.addReview(searchedPerson.getName() + ": " + review + "\n\n");
            }            
            
            jTextArea2.setText("");
            
        } catch (IOException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg1;
    private javax.swing.ButtonGroup bg2;
    private javax.swing.ButtonGroup bg3;
    private javax.swing.ButtonGroup bg4;
    private javax.swing.ButtonGroup bg5;
    private javax.swing.ButtonGroup bg6;
    private javax.swing.ButtonGroup bg7;
    private javax.swing.JButton btChangePassword;
    private javax.swing.JButton btChangeUsername;
    private javax.swing.JButton btListWithGenre;
    private javax.swing.JComboBox<String> cbGenre;
    private javax.swing.JPanel changePassword;
    private javax.swing.JPanel changeUsername;
    private javax.swing.JPanel deleteAccount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jListAllMovies;
    private javax.swing.JLabel jListAllPeople;
    private javax.swing.JLabel jListMoviesWithGenre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel listAllMovies;
    private javax.swing.JPanel listAllPeople;
    private javax.swing.JPanel listWithGenre;
    private javax.swing.JLayeredPane lp2;
    private javax.swing.JLayeredPane lpInfo;
    private javax.swing.JPanel myList;
    private javax.swing.JScrollPane myListFilm;
    private javax.swing.JPanel myReviews;
    private javax.swing.JPanel myScores;
    private javax.swing.JPanel panelAllFilms;
    private javax.swing.JPanel panelAllSeries;
    private javax.swing.JRadioButton rbChangePassword;
    private javax.swing.JRadioButton rbChangeUsername;
    private javax.swing.JRadioButton rbDeleteAccount;
    private javax.swing.JRadioButton rbFilmGenre;
    private javax.swing.JRadioButton rbMyList;
    private javax.swing.JRadioButton rbMyReviews;
    private javax.swing.JRadioButton rbMyScores;
    private javax.swing.JRadioButton rbSeriesGenre;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextArea taMyScores;
    private javax.swing.JTable tableAllActors;
    private javax.swing.JTable tableAllBackStage;
    private javax.swing.JTable tableAllFilms;
    private javax.swing.JTable tableAllSeries;
    private javax.swing.JTable tableMovieGenre;
    private javax.swing.JTable tableMyListFilm;
    private javax.swing.JTable tableMyListSeries;
    private javax.swing.JPanel userEnterance;
    private javax.swing.JPanel userInfo;
    private javax.swing.JPanel userSettings;
    // End of variables declaration//GEN-END:variables
}
