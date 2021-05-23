package com.demo;

public class Editor {

    private String content;

    /**
     * This creates the state to be added to history
     * @return
     */
    public EditorState createState() {
        return new EditorState(content);
    }

    /**
     * Once the history class which is the caretaker return the state
     * Use that state to set the editor state
     * @param state
     */
    public void restore(EditorState state){
        content = state.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
