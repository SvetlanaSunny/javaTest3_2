public class BmiService {
    public static float Calculate(int massa, int height) {
        float h = (float) height / 100f;
        float BodyMassIndex = massa / (h * h);
        return (BodyMassIndex);
    }
}
