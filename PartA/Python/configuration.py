class Configuration:
    _instance = None
    
    def __new__(c):
        if Configuration._instance is None:
            Configuration._instance = super().__new__(c)
        return Configuration._instance

    def __init__(self):
        if not hasattr(self, '_initialized'):
            self.app_name = "ECS160-HW1"
            self.log_level = "INFO"
            self.max_connections = 32
            self.debug_mode = True
            self._initialized = True
            
    @staticmethod
    def get_instance():
        return Configuration()
    
    
    
    
