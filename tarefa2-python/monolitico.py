print("SISTEMA DE VENDAS")

produtos = []
quantidades = []
precos = []
subtotais = []

total_bruto = 0

quant_itens = int(input("Quantos produtos deseja registrar? "))

for i in range(quant_itens):
    print(f"\nProduto {i+1}:")
    nome = input("Nome do produto: ")
    quant = int(input("Quantidade: "))
    preco_unit = float(input("Preço unitário (R$): "))

    subtotal = quant * preco_unit

    produtos.append(nome)
    quantidades.append(quant)
    precos.append(preco_unit)
    subtotais.append(subtotal)

    total_bruto += subtotal

desconto = 0
if total_bruto > 500:
    desconto = total_bruto * 0.10
elif total_bruto > 200:
    desconto = total_bruto * 0.05

total_final = total_bruto - desconto

print("\n\n CUPOM FISCAL ")
for i in range(quant_itens):
    print(f"{produtos[i]}  |  {quantidades[i]} x R$ {precos[i]:.2f}  =  R$ {subtotais[i]:.2f}")

print("--------------------------------")
print(f"TOTAL BRUTO:   R$ {total_bruto:.2f}")
print(f"DESCONTO:      R$ {desconto:.2f}")
print(f"TOTAL FINAL:   R$ {total_final:.2f}")
print("================================")
