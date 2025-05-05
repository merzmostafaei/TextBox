public class TextBox extends UiControl {

    public TextBox() {
        super(true); // we passed the input of UiControl input as SUPER for it's child constructer
        System.out.println("TextBox");
    }

    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void clear(){
        text = "";
    }

    @Override //override the toString Method
    public String toString() {
        return text;
    }
}
