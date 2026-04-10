import re

def validate_emails():
    t_str = input().strip()
    if not t_str: return
    t = int(t_str)
    
    for _ in range(t):
        email = input().strip()
        try:
            if " " in email:
                raise ValueError
            
            if email.count('@') != 1:
                raise ValueError
                
            username, domain = email.split('@')
            
            if not username:
                raise ValueError
                
            # Check username for alphanumeric, underscores, or dots
            if not re.match(r'^[a-zA-Z0-9_.]+$', username):
                raise ValueError
                
            if '.' not in domain:
                raise ValueError
                
            print("VALID")
        except ValueError:
            print("INVALID")

if __name__ == "__main__":
    validate_emails()
