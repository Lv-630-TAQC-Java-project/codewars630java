package com.ss.ita.kata;

import org.testng.annotations.DataProvider;


public class SixDataProvider  extends DataProviderImpl{

    final String b1 = "1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10";
    final String b1sol = "Original Balance: 1000.00\\r\\n125 Market 125.45 Balance 874,55\\r\\n126 Hardware 34.95 Balance 839,60\\r\\n127 Video 7.45 Balance 832,15\\r\\n128 Book 14.32 Balance 817,83\\r\\n129 Gasoline 16.10 Balance 801,73\\r\\nTotal expense  198,27\\r\\nAverage expense  39,65";

    final String b2 = "1233.00\n125 Hardware;! 24.80?\n123 Flowers 93.50;\n127 Meat 120.90\n120 Picture 34.00\n124 Gasoline 11.00\n" +
            "123 Photos;! 71.40?\n122 Picture 93.50\n132 Tyres;! 19.00,?;\n129 Stamps; 13.60\n129 Fruits{} 17.60\n129 Market;! 128.00?\n121 Gasoline;! 13.60?";
    final String b2sol = "Original Balance: 1233.00\\r\\n125 Hardware 24.80 Balance 1208,20\\r\\n123 Flowers 93.50 Balance 1114,70\\r\\n127 Meat 120.90 Balance 993,80\\r\\n120 Picture 34.00 Balance 959,80\\r\\n124 Gasoline 11.00 Balance 948,80\\r\\n123 Photos 71.40 Balance 877,40\\r\\n122 Picture 93.50 Balance 783,90\\r\\n132 Tyres 19.00 Balance 764,90\\r\\n129 Stamps 13.60 Balance 751,30\\r\\n129 Fruits 17.60 Balance 733,70\\r\\n129 Market 128.00 Balance 605,70\\r\\n121 Gasoline 13.60 Balance 592,10\\r\\nTotal expense  640,90\\r\\nAverage expense  53,41";

    @DataProvider(name = "balance")
    public Object[][] balance() {
        Object[][] param = new Object[][]{
                {b1, b1sol},{b2,b2sol}};
        return combine(sixImplPackProvider(),param);
   final String rainfallSheet =
            "Ubbin Falls:Jan 265.5,Feb 442.6,Mar 268.6,Apr 372.6,May 281,Jun 287.3,Jul 237.2,Aug 117,Sep 189.8,Oct 280.2,Nov 186.7,Dec 75.1\n" +
                    "Alderdyfi:Jan 274.8,Feb 224.5,Mar 337.6,Apr 402.3,May 272.2,Jun 318.7,Jul 248.4,Aug 366.3,Sep 223.8,Oct 74,Nov 243.6,Dec 120.7\n" +
                    "Shipton:Jan 441,Feb 218.7,Mar 332.6,Apr 119.9,May 239.4,Jun 360,Jul 322.6,Aug 283.4,Sep 300.5,Oct 386.7,Nov 359,Dec 246.1\n" +
                    "Greenflower:Jan 247.1,Feb 226.2,Mar 140.9,Apr 350.8,May 254.7,Jun 364.3,Jul 192.4,Aug 254.6,Sep 229.2,Oct 279.9,Nov 180.1,Dec 254.9";

    @DataProvider(name = "rainfallMean")
    public Object[][] mean() {
        Object[][] params = new Object[][]{
                {"Ubbin Falls", rainfallSheet, 250.3},
                {"Ubbin", rainfallSheet, -1.0},
                {"a", rainfallSheet, -1.0}
        };
        return combine(sixImplPackProvider(), params);
    }

    @DataProvider(name = "rainfallVariance")
    public Object[][] variance() {
        Object[][] params = new Object[][]{
                {"Ubbin Falls", rainfallSheet, 9337.3},
                {"Ubbin", rainfallSheet, -1.0},
                {"a", rainfallSheet, -1.0}
        };

        return combine(sixImplPackProvider(), params);

    }
}
