public class Box {
    public static void main(String[] args) {
        double length = 297;
        double width = 210;
        double min = width < length ? width : length;

        double volume = 0;

        double approximateHeight = 0;
        double resultHeight = 0;

        for (double wallHeight = 0; wallHeight < min / 2; wallHeight += 1) {
            double currentVolume = wallHeight * (length - 2 * wallHeight) * (width - 2 * wallHeight);
            if (currentVolume > volume) {
                volume = currentVolume;
                approximateHeight = wallHeight;
            }
        }

        for (double wallHeight = approximateHeight - 1; wallHeight < approximateHeight + 1; wallHeight += 0.001) {
            double currentVolume = wallHeight * (length - 2 * wallHeight) * (width - 2 * wallHeight);
            if (currentVolume > volume) {
                volume = currentVolume;
                resultHeight = wallHeight;
            }
        }

        System.out.println("Максимальный объём: " + volume);
        System.out.println("Высота стены: " + resultHeight);
    }
}
