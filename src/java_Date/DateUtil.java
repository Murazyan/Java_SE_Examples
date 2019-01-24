package java_Date;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DateUtil {

    public static void main(String[] args) {
    }

    //երբ մեթոդին տրվում է ցանկացած ֆորմատով ամսաթիվ է այն տվյալ դեպքում բերվում է yyyy-MM-dd ֆորմատի
    public static String changeDateFormat(String date) {
        Date d = new Date(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = simpleDateFormat.format(d);
        return formatDate;
    }

    //երբ փոխանվում է ամիսն ու տարին և կալենդարի վրա որոշվում է առաջին և վերջին օրերը
    public static List<String> getMinAndMaxDateOFCalendarByYearAndMonth(int year, int month) {
        if (year < 0 || month > 12 || month < 1) {
            return new ArrayList<>();
        }
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate arajinOr = LocalDate.of(year, month, 1);
        LocalDate verjinOr = yearMonth.atEndOfMonth(); // ամսվա վերջին օրը yyyy-MM-dd ֆորմատով
        LocalDate previousTuesday = arajinOr.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate nextTuesday = verjinOr.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        return new ArrayList<>(Arrays.asList(previousTuesday.toString(), nextTuesday.toString()));
    }


    //այստեղ վերադարձվում է օրացույցի վրա տվյալ ամսվա առաջին օրը, բայց այս մեթոդում չեն օգտագործվել պատրաստի ֆունկցիաներ
    public static String getMinDateOfCalendarByYearAndMonth(int year, int month) {
        String minDate = "";
        int minDay;
        int minMont;
        int minYear;
        int lastEDayOfThePreviousMonth; //նախորդ ամսվա վերջին օրը
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDayOfMonth = yearMonth.atDay(1);//ամսվա առաջին օրը yyyy-MM-dd ֆորմատով
        LocalDate lastDayOfMonth = yearMonth.atEndOfMonth(); // ամսվա վերջին օրը yyyy-MM-dd ֆորմատով
        int placeOfFirstDay_Value = firstDayOfMonth.getDayOfWeek().getValue(); // ցույց է տալիս ամսվա առաջին օրվա տեղը
        int placeOfLastDay_Value = lastDayOfMonth.getDayOfWeek().getValue(); // ցույց է տալիս ամսվա վերջին  օրվա տեղը
        if (month != 1) {
            lastEDayOfThePreviousMonth = YearMonth.of(year, month - 1).atEndOfMonth().getDayOfMonth();
            minYear = year;
            minMont = month - 1;
            if (placeOfFirstDay_Value == 1) {
                minDay = firstDayOfMonth.getDayOfMonth();
                minMont = firstDayOfMonth.getMonth().getValue();
            } else {
                minDay = lastEDayOfThePreviousMonth - placeOfFirstDay_Value + 2;
            }
            minDate += minYear + "-" + minMont + "-" + minDay;
            System.out.println("minDate ------------ " + minDate);
        }
        if (month == 1) {
            lastEDayOfThePreviousMonth = YearMonth.of(year - 1, 12).atEndOfMonth().getDayOfMonth();
            if (placeOfFirstDay_Value == 1) {
                minYear = year;
                minDay = 1;
                minMont = month;
            } else {
                minDay = lastEDayOfThePreviousMonth - placeOfFirstDay_Value + 2;
                minYear = year - 1;
                minMont = 12;
            }
            minDate += minYear + "-" + minMont + "-" + minDay;
            return minDate;
        }
        return minDate;

    }
}




