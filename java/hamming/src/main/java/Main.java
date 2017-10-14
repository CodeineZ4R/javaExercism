class Main { 
        public static void main (String ... args) { 
                String string = "aaa";
                System.out.println(string.length());
                char[] ch = string.toCharArray();
                System.out.println(ch[0]);
                System.out.println(ch.length);
                System.out.println("A" == "A");
                System.out.println('A' == 'A');
                System.out.println(ch[0] == ch[1]);

                if (true) {
                        System.out.println("True");
                }

                //throw new NullPointerException();
                //throw new IllegalArgumentException("hi");
                if (string.isEmpty()){
                        System.out.println("isEmpty");

                }else{
                        System.out.println("isnotEmpty");
                }
        }
} 
