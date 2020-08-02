package arrays.usingObject;

public class VetorObjectMain {

    public static void main(String[] args) throws Exception {
        VetorObject ob = new VetorObject(10);

        try {

            ob.adiciona("elemento 01");
            ob.adiciona("elemento 02");
            ob.adiciona("elemento 03");
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(ob);

        ob.adiciona("elemento 04");

        ob.buscaElemento(1);

        //ob.adiciona(3, "elemento 04");

        System.out.println(ob);


    }
}
