package lawncarebilling;

public class Time {
    double seconds;

public Time()
{
    seconds = 0.0;
}

public Time(double newSeconds)
{
    seconds = newSeconds;
}

public Time(int hours, int minutes, double newSeconds)
{
    seconds = (double)(hours * 3600 + minutes * 60) + newSeconds;
}

public double getTime()
{
    return seconds;
}

public int getHours()
{
    return (int)seconds / 3600;
}

public int getMinutes()
{
    int remainingSeconds = (int)seconds % 3600;
    return remainingSeconds / 60;
}

public double getSeconds()
{
    return seconds % 60.0;
}

public String toString()
{
    int hours = (int)seconds / 3600;
    int minutes = (int)seconds % 3600 / 60;
    return hours + ":" + minutes + ":" + seconds % 60.0;
}

public Time plus(Time otherTime)
{
    return new Time(seconds + otherTime.getSeconds());
}

public Time minus(Time otherTime)
{
    return new Time(seconds - otherTime.getSeconds());
}
 
}
