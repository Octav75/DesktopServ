package Lab9;

public class CommandLineEx {

    public static void main(String[] args) {

        int sum = 0;

        for (int i=0; i < args.length; i++) {

//            try {
//
//                sum += Integer.parseInt(args[i]);
//                catch (Exception e); {
//                    e.printStackTrace();
//                }
//            }

            if (Integer.parseInt(args[i]) % 2 == 0) {   // Verificam daca numerele sint pare
                sum += Integer.parseInt(args[i]);
            }

//            System.out.println(args[i]);


        }

        System.out.println(sum);
    }

}
