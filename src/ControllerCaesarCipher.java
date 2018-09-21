import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerCaesarCipher {

    private ViewCaesarCipher theView;
    private ModelCaesarCipher theModel;

    public ControllerCaesarCipher(ViewCaesarCipher theView, ModelCaesarCipher theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addEncryptListener(new EncryptListener());
        this.theView.addDecryptListener(new DecryptListener());
    }

    class EncryptListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String firstString = "";
            int firstIndex = 0;

            try{

                firstString = theView.getFirstString();
                firstIndex = theView.getFirstIndex();

                theModel.encryptString(firstString, firstIndex);

                theView.setFirstResult(theModel.getEncryptedString());

            }

            catch(NumberFormatException ex){

                System.out.println(ex);

                theView.displayErrorMessage("Enter any string in first line.");

            }

        }

    }

    class DecryptListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String secondString = "";
            int secondIndex = 0;

            try{

                secondString = theView.getSecondString();
                secondIndex = theView.getSecondIndex();

                theModel.decryptString(secondString, secondIndex);

                theView.setSecondResult(theModel.getDecryptedString());

            }

            catch(NumberFormatException ex){

                System.out.println(ex);

                theView.displayErrorMessage("Enter any string in first line.");

            }

        }

    }

}
