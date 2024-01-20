package IntellijStarting.test;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (extraBuckets < 0) {
            return -1;
        }
        int buckets = getBucketCount(width, height, areaPerBucket);
        return buckets == -1 ? buckets : buckets - extraBuckets;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return getBucketCount(width * height, areaPerBucket);
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int PaintBucketNeed = (int) Math.ceil(area / areaPerBucket);
        return PaintBucketNeed;
    }
}
