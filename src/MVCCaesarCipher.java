public class MVCCaesarCipher {

    public static void main(String[] args) {

        ViewCaesarCipher theView = new ViewCaesarCipher();

        ModelCaesarCipher theModel = new ModelCaesarCipher();

        ControllerCaesarCipher theController = new ControllerCaesarCipher(theView,theModel);

        theView.setVisible(true);

    }
}
