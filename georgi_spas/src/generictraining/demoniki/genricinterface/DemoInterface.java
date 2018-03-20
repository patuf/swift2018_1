package generictraining.demoniki.genricinterface;

public class DemoInterface implements Compare<Integer> {
private int a=12;
    public static void main(String[] args) {

        DemoInterface probs=new DemoInterface();

        System.out.println(probs.compareTo(2));


    }

    @Override
    public int compareTo(Integer value) {
      if (this.a>value){
          return 1;
      }else if (this.a<value){
          return -1;
      }
        return 0;
    }
}
