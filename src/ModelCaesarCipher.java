public class ModelCaesarCipher {

    private String encryptedString = "";

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

    public String getEncryptedString(){

        return encryptedString;

    }

}