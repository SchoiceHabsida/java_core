import java.util.Arrays;

public class Task_6_5_7 {
    //here your code
    public static class AsciiCharSequence implements CharSequence {
        private byte[] arrByte;

        public AsciiCharSequence(byte[] arrByte) {
            this.arrByte = arrByte;
        }
        @Override
        public int length() {
            return arrByte.length;
        }
        @Override
        public char charAt(int index) {
            return (char)arrByte[index];
        }
        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] res = Arrays.copyOfRange(arrByte, start, end);
            return new AsciiCharSequence(res);
        }
        @Override
        public String toString() {
            return new String(arrByte);
        }
    }
}