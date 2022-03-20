public class Main {
    public static void main(String[] args) {
        int massa = 54; // масса тела
        int height = 180; // рост
        BmiService service = new BmiService();
        float res = service.Calculate(massa, height);
        System.out.println(res);
    }
}
