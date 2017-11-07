import socket
import psutil
import time
import json
while True :
 host = (socket.gethostname())
 mem = psutil.virtual_memory()
 cpu = psutil.cpu_percent(interval=3)
 disk = psutil.disk_usage('/')
 allstats = {'memU' : mem[1], 'diskU' : disk[3], 'cpuU' : cpu, 'host': host }
 print json.dumps(allstats)
 time.sleep(3)
