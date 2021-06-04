fruit_dict =	{
  "apple": "120",
  "banana": "60",
  "grape": "30",
  "orange": "200"
}
fruit_need= input("What are you looking for? ").lower()	
if fruit_need in fruit_dict:
    print(fruit_need,"Fruit is present in the shop")
else :
    print(fruit_need,"Fruit is not present in the shop") 
