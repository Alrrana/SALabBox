public class Box {
    public static void main(String[] args) {
        double length = 297;
        double width = 210;
        double min = width < length ? width : length;

        double volume = 0;

        double approximateResult = 0;

        for (double wallHeight = 0; wallHeight < min / 2; wallHeight += 1) {
            double currentVolume = wallHeight * (length - 2 * wallHeight) * (width - 2 * wallHeight);
            if (currentVolume > volume) {
                approximateResult = currentVolume;
            }
        }

        for (double wallHeight = approximateResult - 1; wallHeight < approximateResult + 1; wallHeight += 0.001) {
            double currentVolume = wallHeight * (length - 2 * wallHeight) * (width - 2 * wallHeight);
            if (currentVolume > volume) {
                volume = currentVolume;
            }
        }

        System.out.println(volume);
    }
}
