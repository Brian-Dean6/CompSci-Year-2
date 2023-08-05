input_string = input("Enter a list of numbers in the format 'number:number' (separated by a space): ")
input_list = input_string.split()
output_dict = {}

for item in input_list:
  key, value = item.split(':')
  output_dict[int(key)] = int(value)

print(output_dict)
