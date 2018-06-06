package org.xx.config.core.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 14-4-3.
 */
public class DateUtils {
    private static final Logger log = LoggerFactory.getLogger(DateUtils.class);

    public static final String TIME_FORMAT_TO_YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * 14-12-4 下午7:24
     * @param time
     * @return
     */
    public static String fromTimeToStr(long time) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return sdf.format(calendar.getTime());
    }

    /**
     * 2014-12-04 19:24:29
     * @param time
     * @return
     */
    public static String fromTimeToStandardStr(long time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return sdf.format(calendar.getTime());
    }

    public static String fromTimeToFromatStr(long time, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return sdf.format(calendar.getTime());
    }

    /**
     * MM-DD-HH-mm，表示在MM月DD天HH时mm分
     * @param timeStr
     * @return
     */
    public static long parseTime(String timeStr) {
        String[] timeArr = StringUtils.split(timeStr, "-");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, Integer.parseInt(timeArr[0]) - 1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(timeArr[1]));
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(timeArr[2]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(timeArr[3]));
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    /**
     * D-HH-MM，表示在每周第D天HH时MM分
     * @param timeStr
     * @return
     */
    public static long parseWeekTime(String timeStr) {
        String[] timeArr = StringUtils.split(timeStr, "-");
        Calendar calendar = Calendar.getInstance();
        int week = Integer.parseInt(timeArr[0]);
        int currWeek = calendar.get(Calendar.DAY_OF_WEEK);
        calendar.set(Calendar.DAY_OF_WEEK, week);
        if(currWeek > week) {
            calendar.add(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
        }
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(timeArr[1]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(timeArr[2]));
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    /**
     * 获取某个时间戳的本周几： 周1 ~ 周日：1 ~ 7
     * @param millisTime
     * @param dayOfWeekNum
     * @return
     */
    public static long getThisWeekNumTime(Long millisTime, int dayOfWeekNum) {
        dayOfWeekNum = (dayOfWeekNum % 7) + 1;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millisTime);
        calendar.set(Calendar.DAY_OF_WEEK, dayOfWeekNum);
//        calendar.set(Calendar.WEEK_OF_MONTH, dayOfWeekNum);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    /**
     * 获取某个时间戳的下一个周几： 周1 ~ 周日：1 ~ 7
     * @param millisTime
     * @param dayOfWeekNum
     * @return
     */
    public static long getNextWeekNumTime(Long millisTime, int dayOfWeekNum) {
        dayOfWeekNum = (dayOfWeekNum % 7) + 1;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millisTime);
        int currWeek = calendar.get(Calendar.DAY_OF_WEEK);
        calendar.set(Calendar.DAY_OF_WEEK, dayOfWeekNum);
        if(currWeek >= dayOfWeekNum) {
            calendar.add(Calendar.WEEK_OF_MONTH, 1);
        }
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    /**
     * 获取某个时间戳的上一个周几： 周1 ~ 周日：1 ~ 7
     * @param millisTime
     * @param dayOfWeekNum
     * @return
     */
    public static long getLastWeekNumTime(Long millisTime, int dayOfWeekNum) {
        dayOfWeekNum = (dayOfWeekNum % 7) + 1;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millisTime);
        int currWeek = calendar.get(Calendar.DAY_OF_WEEK);
        calendar.set(Calendar.DAY_OF_WEEK, dayOfWeekNum);
        if(currWeek <= dayOfWeekNum) {
            calendar.add(Calendar.WEEK_OF_MONTH, -1);
        }
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    public static long parseFullTimeStr(String fullTimeStr, String format) {
        SimpleDateFormat sdf  =   new SimpleDateFormat(format);
        try {
            Date date = sdf.parse(fullTimeStr);
            return date.getTime();
        } catch (ParseException e) {
            log.error("",e);
            return 0;
        }
    }

	//获得本周一0点时间
	public static long getTimesWeekmorning(long millis){
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0,0);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return cal.getTimeInMillis();
	} 

    /**
     * 获取今天的 hour 时 minute 分 0 秒 0 毫秒 所对应的 Date
     *
     * @param hour
     * @param minute
     * @return
     */
    public static Date getDate(int hour, int minute) {
        LocalTime localTime = LocalTime.of(hour, minute);
        return convertLDTToDate(localTime.atDate(LocalDate.now()));
    }

    //LocalDateTime转换为Date
    public static Date convertLDTToDate(LocalDateTime time) {
        return Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
    }

    //获取指定时间的指定格式
    public static String formatTime(LocalDateTime time, String pattern) {
        return time.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String format(long millis, String pattern) {
        return formatTime(LocalDateTime.ofInstant(new Date(millis).toInstant(), ZoneId.systemDefault()), pattern);
    }
}
