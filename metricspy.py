import psutil
count = 1
while count == 1 :
	mem = psutil.virtual_memory()
	cpu = psutil.cpu_percent(interval=1)
	disk = psutil.disk_usage('/')
	#memoryu = "memoryu:", mem[1]
	#disku = "disku:", disk[3]
	print mem[1],disk[3],cpu
