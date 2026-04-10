import sys

def solve():
    try:
        line = sys.stdin.readline()
        if not line:
            return
        t = int(line.strip())
        for _ in range(t):
            n = int(sys.stdin.readline().strip())
            
            # Maximize cakes (6 eggs each)
            num_cakes = n // 6
            remaining_eggs = n % 6
            
            # Each pastry requires 2 eggs
            num_pastries = remaining_eggs // 2
            
            if num_pastries >= 2:
                print("YES")
            else:
                print("NO")
    except EOFError:
        pass

if __name__ == "__main__":
    solve()
