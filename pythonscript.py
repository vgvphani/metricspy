import requests
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
 data = [('hostname', hostname), ('memoryUsage', mem[1]),('diskUsage', disk[3]), ('cpuUsage', cpu)]
 data = collections.OrderedDict(data)
 url = 'http://localhost:8080/api/metric'
 headers = {'content-type': 'application/json'}
 response = requests.post('http://localhost:8080/api/metric', data=json.dumps(data), headers=headers)
 print response
 time.sleep(3)
 
   
