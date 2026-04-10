def process_marks():
    try:
        n = int(input().strip())
        # Reading N space-separated integers, potentially across multiple lines
        marks = []
        while len(marks) < n:
            marks.extend(map(int, input().split()))
            
        # 1. Remove duplicates and 2. Sort
        unique_marks = sorted(list(set(marks)))
        print(unique_marks)
        
        # 3. Count frequencies
        freq = {mark: marks.count(mark) for mark in unique_marks}
        print(freq)
        
        # 4. Find second highest unique mark
        if len(unique_marks) < 2:
            print("NO SECOND HIGHEST")
        else:
            print(unique_marks[-2])
            
    except EOFError:
        pass

if __name__ == "__main__":
    process_marks()
