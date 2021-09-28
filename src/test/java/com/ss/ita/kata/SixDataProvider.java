package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SixDataProvider extends DataProviderImpl {
    // Used for rainfall tests - Kata 6
    private final String rainfallSheet =
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
