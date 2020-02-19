class Point {
    float xCordinate;
    float yCordinate;
    float zCordinate;

    Point(float xCordinate, float yCordinate, float zCordinate){
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.zCordinate = zCordinate;
    }

    float getXCordinate() {
        return this.xCordinate;
    }

    float getYCordinate() {
        return this.yCordinate;
    }

    float getZCordinate() {
        return this.zCordinate;
    }
}

class BadCode {
    // function name is not pronouceable
    // Intelligent conversation is not possible
    static void printXcorYCorZCor(Point p) { 
        System.out.println("x : " + p.getXCordinate());
        System.out.println("y : " + p.getYCordinate());
        System.out.println("z : " + p.getZCordinate());
    }

    static void run() {
        printXcorYCorZCor(new Point(1,2,3));
    }
}

class GoodCode {
    // Intelligent conversation is now possible
    static void printCordinates(Point point) {
        System.out.println("x : " + point.getXCordinate());
        System.out.println("y : " + point.getYCordinate());
        System.out.println("z : " + point.getZCordinate());
    }

    static void run() {
        printCordinates(new Point(1,2,3));
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("******** output with bad code *********");
        BadCode.run();
        System.out.println("******** output with good code ********");
        GoodCode.run();
    }
}