import requests
import collections
import psutil
import socket
import time
import json
while True :
 hostname = socket.gethostname()
 mem = psutil.virtual_memory().percent
 cpu = psutil.cpu_percent(interval=3)
 disk = psutil.disk_usage('/')
 data = [('hostname', hostname), ('memoryUsage', (mem)),('diskUsage', disk[3]), ('cpuUsage', cpu)]
 data = collections.OrderedDict(data)
 url = 'http://192.168.1.154:8080/api/metric'
 headers = {'content-type': 'application/json'}
## print data
 response = requests.post('http://192.168.1.154:8080/api/metric', data=json.dumps(data), headers=headers)
 print response
 time.sleep(3)
   
