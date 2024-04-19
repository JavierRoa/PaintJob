public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(-3.4, 2.1, 1.4));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }
    private static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // Validación
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) {
            return -1;
        }
        return (int) Math.ceil((width * height - areaPerBucket * extraBuckets) / areaPerBucket); // Retorna redondeo hacia arriba, tomando el area (width * height), menos el area cubierta por los extraBuckets, y luego dividido por el area cubierta por 1 tarro de pintura.
    }
    private static int getBucketCount(double width, double height, double areaPerBucket) {
        // Validación
        if(width<=0 || height<=0 || areaPerBucket<=0) {
            return -1;
        }
        return (int) Math.ceil(width * height / areaPerBucket);  // Retorna redondeo hacia arriba, tomando el area (width * height), y dividiéndolo por la cantidad de area que cubre cada tarro de pintura.
    }
    private static int getBucketCount(double area, double areaPerBucket) {
        // Validación
        if(area<=0 || areaPerBucket<=0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
