class Solution(object):

#  public static void main(String arg[]) {
#         List<String> actions = new ArrayList<>();
#         actions.add("PAY: id=14");
#         actions.add("CREATE: id=14&amount=800&currency=USD");

#         actions.add("FINALIZE: id=14&amount=600&currency=USD");
#         //actions.add("PAY: id=14");
#         //actions.add("");

#         System.out.println(calculate_total_owed(actions));
#     }
    def calculate_total_owed(self, actions):

        if actions == None or len(actions) == 0:
            return 0
        
        #Write your code here
        priceMap = {}
        statusMap = {}

        for action in actions: 
            action = action.lower()
            id = self.getId(action)
            if action.startswith("create"): 
                if action.endswith("usd"):
                    amount = self.getAmount(action)
                    self.create(id, amount, priceMap, statusMap)

            
            elif action.startswith("finalize"): 
                if action.endswith("usd"):
                    amount = self.getAmount(action)
                    self.finalize(id, amount, priceMap, statusMap)
                
            
            else: 
                self.pay(id, priceMap, statusMap)
            
        
        return self.getTotal(priceMap)
    

    def getTotal(self, priceMap): 
        sum = 0
        for key in priceMap:
            sum += priceMap.get(key)

        
        return sum
    

    def create(self, id,  amount,  priceMap, statusMap): 
        if id not in statusMap or statusMap.get(id) == "pay": 
            priceMap[id] = amount
            statusMap[id] = "create"
        


    def finalize(self, id,  amount,  priceMap, statusMap):
        if id in priceMap and statusMap.get(id) == "create": 
            priceMap[id] = amount
            statusMap[id] = "finalize"
        
    

    def pay(self, id, priceMap, statusMap):
        if id in priceMap and statusMap.get(id) == "finalize": 
            priceMap.pop(id)
        
        statusMap[id] = "pay"
    

    def getId(self, s): 
        split = s.split("&")

        return int(split[0].split("=")[1])
        
    

    def getAmount(self, s):
        split = s.split("&")

        return  int(split[1].split("=")[1])
    


s= Solution()

actions = []

actions.append("CREATE: id=14&amount=800&currency=USD")

actions.append("FINALIZE: id=14&amount=600&currency=USD")
actions.append("PAY: id=14")

print(s.calculate_total_owed(actions))