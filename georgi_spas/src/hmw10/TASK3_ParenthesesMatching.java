package hmw10;

import java.util.ArrayList;
import java.util.List;

public class TASK3_ParenthesesMatching {
    public static void main(String[] args) {

        String parahtese = "{()}";


        List<Character> skoba = new ArrayList<>();

        for (int i = 0; i < parahtese.length(); i++) {
            char open = parahtese.charAt(i);

            char open1 = '[';
            char open2 = '(';
            char open3 = '{';


            char close1 = ']';
            char close2 = ')';
            char close3 = '}';


            if (open == open1 || open == open2 || open == open3) {
                skoba.add(open);

            } else if (close1 == open || close2 == open || close3 == open) {
                char close = open;
                skoba.add(close);
                //check next parathes is close

                boolean isClose = true;
                boolean isSymetry = true;//check every open and close bracket
                if (i + 1 < parahtese.length()) {// is close bracket
                    while (i < parahtese.length() && isClose) {

                        close = parahtese.charAt(i + 1);
                        if (close == close1 || close == close2 || close == close3) {
                            skoba.add(close);
                            isClose = true;
                            i++;
                            if (i + 1 >= parahtese.length()) {
                                // is open bracket


                                for (int j = 0; j < skoba.size() / 2; j++) {
                                   // int sumSymetry = skoba.get(i) - skoba.get(skoba.size() - j);
                                  //  if ()

                                    isSymetry = false;
                                    skoba.clear();
                                }
                            }

                        }
                    }
                }
            } else {
                // is open bracket


                for (int j = 0; j < skoba.size() / 2; j++) {
                    if (skoba.get(i) != skoba.get(skoba.size() - j)) {
                       // isSymetry = false;
                        skoba.clear();
                    }
                }
               // if (!isSymetry) {
                 //   return;
                //}
            }
        }


    }
}

//
//
//                isClose = true;
//              i++;

//check symetri brackets

//}

//    }
//          }

//}
//}



