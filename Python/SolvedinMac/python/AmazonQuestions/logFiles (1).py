class Solution:
    def reorderLogFiles(self, logs):
        """
        :type logs: List[str]
        :rtype: List[str]
        """
        digits = []
        letters = []
		# divide logs into two parts, one is digit logs, the other is letter logs
        for log in logs:
            if log.split()[1].isdigit():
                digits.append(log)
            else:
                letters.append(log)
                
        digits.sort(key = lambda x: x.split()[1])            #when suffix is tie, sort by identifier
        letters.sort(key = lambda x: x.split()[1:])           #sort by suffix
        result = letters + digits                                        #put digit logs after letter logs
        return result



logFileSize = 5
logLines = 
[a1 9 2 3 1] 
[g1 act car] 
[zo4 4 7] 
[ab1 off key dog]
[a8 act zoo]