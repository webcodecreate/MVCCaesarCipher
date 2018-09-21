public class ModelCaesarCipher {

    private String encryptedString = "";
    private String decryptedString = "";

    public void encryptString(String firstString, int firstIndex){

        for(int i = 0; i < firstString.length(); ++i){
            char ch = firstString.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + firstIndex);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                encryptedString += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + firstIndex);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                encryptedString += ch;
            }
            else {
                encryptedString += ch;
            }
        }

    }

    public void decryptString(String secondString, int secondIndex){

        for(int i = 0; i < secondString.length(); ++i){
            char ch = secondString.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - secondIndex);

                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1);
                }

                decryptedString += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - secondIndex);

                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1);
                }

                decryptedString += ch;
            }
            else {
                decryptedString += ch;
            }
        }

    }

    public String getEncryptedString(){

        return encryptedString;

    }

    public String getDecryptedString(){

        return decryptedString;

    }

}