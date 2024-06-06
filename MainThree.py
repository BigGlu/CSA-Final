class Time:
    def __init__(self, h=0, m=0):
        if 1 <= h <= 23:
            self.hour = h
        else:
            self.hour = 0
        if 1 <= m <= 59:
            self.minute = m
        else:
            self.minute = 0
    
    def increment(self):
        self.minute += 1
        if self.minute >= 60:
            self.minute = 0
            self.hour += 1
            if self.hour >= 24:
                self.hour = 0
    
    def convert(self):
        hr = ""
        min = ""
        if self.hour == 0:
            hr = "12"
        elif self.hour < 12:
            hr = str(self.hour)
        elif self.hour == 12:
            hr = "12"
        else:
            hr = str(self.hour - 12)
        
        if self.minute < 10:
            min = "0" + str(self.minute)
        else:
            min = str(self.minute)
        
        if self.hour < 12:
            return hr + ":" + min + " AM"
        else:
            return hr + ":" + min + " PM"

    def __str__(self):
        return "%02d%02d" % (self.hour, self.minute)

if __name__ == "__main__":
    t1 = Time(0, 0)
    print(t1.convert())

    t2 = Time(14, 56)
    print(t2.convert())

    t3 = Time(0, 12)
    print(t3.convert())

    t4 = Time(5, 17)
    print(t4.convert())

    t5 = Time(12, 15)
    print(t5.convert())

    t6 = Time(0, 15)
    print(t6.convert())

    t7 = Time(23, 59)
    print(t7.convert())
