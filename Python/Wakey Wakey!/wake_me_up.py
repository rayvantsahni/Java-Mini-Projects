import sched
import time
import winsound as ws

def set_alarm(alarm_time, wav_file, message):
    s = sched.scheduler(time.time, time.sleep)
    s.entertabs(alarm_time, 1, print, argument = (message, ))
    s.entertabs(alarm_time, 1, ws.PlaySound, argumetn = (wav_file, ws.SND_FILENAME))
    print("Alarm is set for", time.asctime(time.localtime(alarm_time)))
    s.run()
