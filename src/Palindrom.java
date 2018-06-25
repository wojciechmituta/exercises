public class Palindrom {
    public String text;

    public Palindrom(String text) {
        this.text = text;
    }

    public boolean isPalindrom() {
        boolean check = true;
        char arr[] = text.toCharArray();
        int textLength = text.length();

        for (int i = 0; i < textLength / 2; i++) {
            if (arr[i] != arr[textLength - 1 - i]) {
               return false;
            }
        }
        return true;
    }

    public void returnS() {
        if (isPalindrom()) System.out.println("the word: " + text + " is a palindrome\n");
        if (!isPalindrom()) System.out.println("the word: " + text + " is not a palindrome\n");
    }

    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom("aaaaaaaaaaaaaaaaa");

        palindrom.returnS();
    }
}
