import collections
import psutil
import socket
import time
import json
while True :
 hostname = socket.gethostname()
 mem = psutil.virtual_memory()
 cpu = psutil.cpu_percent(interval=3)
 disk = psutil.disk_usage('/')
 totusg = [('Host', hostname), ('memU', mem[1]),('diskU', disk[3]), ('cpuU', cpu)]
 totusg = collections.OrderedDict(totusg) 
 print  json.dumps(totusg)
 time.sleep(3)
