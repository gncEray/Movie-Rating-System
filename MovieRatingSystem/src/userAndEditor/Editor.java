package userAndEditor;

public class Editor extends Member {

    private int editorId;
    private static int lastUsedId = 1000;
    
    public Editor(String name, String password) {
        super(name, password);
        this.editorId = lastUsedId++;
    }

    public int getEditorId() {
        return editorId;
    }

    @Override
    public String toString() {
        return super.toString() + "editorId:" + editorId + "\n";
    }    
        
}
