import psutil
import time
import json
while True :
 mem = psutil.virtual_memory()
 cpu = psutil.cpu_percent(interval=3)
 disk = psutil.disk_usage('/')
 totusg = {'memU' : mem[1], 'diskU' : disk[3], 'cpuU' : cpu }
 print  json.dumps(totusg)
 time.sleep(3)

