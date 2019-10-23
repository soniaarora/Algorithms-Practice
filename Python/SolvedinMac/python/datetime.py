from datetime import datetime
from statistics import mean 
# current date and time
now = datetime.now()
dates = ['01/06/2016 04:50','01/08/2016 05:50','05/01/2016 06:50','04/01/2016 07:50']
DATE = [datetime.strptime(x,'%m/%d/%Y %H:%M') for x in dates]

changeTime = []
for time in DATE:
    changeTime.append(datetime.timestamp(time))

meanTime = mean(changeTime)


print("timestamp =", meanTime)

dt_object = datetime.fromtimestamp(meanTime)
print("dt_object =", dt_object)