class OopsBannerApp{
    public static void main(String [] args){
        //feature/uc8
       String[] lines = {
   

            // Pattern for O
            public static String[] getOPattern() {
                return new String[]{
                    " * ",
                    "*   *",
                    "*   *",
                    "*   *",
                    " * "
                };
            }

                // Pattern for P
                public static String[] getPPattern() {
                    return new String[]{
                        "** ",
                        "*   *",
                        "** ",
                        "*    ",
                        "*    "
                    };
                }

            // Pattern for S
            public static String[] getSPattern() {
                return new String[]{
                    " **",
                    "*    ",
                    " * ",
                    "    *",
                    "** "
                };
            }       
    
        }
            String[] oPattern = getOPattern();
            String[] pPattern = getPPattern();
            String[] sPattern = getSPattern();

            for(int i = 0;i <lines.length; i++) {
                System.out.println(oPattern[i] + "   " + pPattern[i] + "   " + sPattern[i]);
            }
    }
    
}