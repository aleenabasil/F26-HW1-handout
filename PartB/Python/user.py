from functools import wraps

def log(func):
    @wraps(func)
    def wrapper(self, *args, **kwargs):
        arguements = [repr(arg) for arg in args]
        arguements += [
            f"{key}={value!r}" 
            for key, value in kwargs.items()
        ]
        
        print( f"[LOG] {type(self).__name__}.{func.__name__}"
              f"({', '.join(arguements)})" )
        
        return func(self, *args, **kwargs)
    return wrapper

class User():
    def get_name(self):
        pass

    def get_email(self):
        pass

    def set_email(self, email):
        pass


class AdminUser(User):
    def __init__(self, name, email):
        self._name = name
        self._email = email
        
    @log
    def get_name(self):
        return self._name

    @log
    def get_email(self):
        return self._email

    @log
    def set_email(self, email):
        self._email = email
