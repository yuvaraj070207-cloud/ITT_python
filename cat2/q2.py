from datetime import datetime

def calculate_work_hours():
    t_str = input().strip()
    if not t_str: return
    t = int(t_str)
    
    for _ in range(t):
        start_str = input().strip()
        end_str = input().strip()
        
        fmt = "%d-%m-%Y %H:%M:%S"
        start_dt = datetime.strptime(start_str, fmt)
        end_dt = datetime.strptime(end_str, fmt)
        
        if end_dt < start_dt:
            print("INVALID")
            continue
            
        duration = end_dt - start_dt
        hours = duration.total_seconds() / 3600
        
        if hours > 5:
            hours -= 1
            
        print(int(hours))

if __name__ == "__main__":
    calculate_work_hours()
