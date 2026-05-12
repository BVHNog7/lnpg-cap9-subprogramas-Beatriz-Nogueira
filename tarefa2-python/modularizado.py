def ler_produto(numero):
    print(f"\nProduto {numero}:")
    nome = input("Nome do produto: ")
    quantidade = int(input("Quantidade: "))
    preco_unitario = float(input("Preço unitário (R$): "))
    return nome, quantidade, preco_unitario


def calcular_subtotal(quantidade, preco_unitario):
    return quantidade * preco_unitario


def calcular_desconto(total_bruto):
    if total_bruto > 500:
        return total_bruto * 0.10
    elif total_bruto > 200:
        return total_bruto * 0.05
    else:
        return 0


def calcular_total(total_bruto, desconto):
    return total_bruto - desconto


def imprimir_cupom(produtos, total_bruto, desconto, total_final):
    print("\n\n========= CUPOM FISCAL =========")
    for item in produtos:
        nome, quantidade, preco_unitario, subtotal = item
        print(f"{nome}  |  {quantidade} x R$ {preco_unitario:.2f}  =  R$ {subtotal:.2f}")

    print("--------------------------------")
    print(f"TOTAL BRUTO:   R$ {total_bruto:.2f}")
    print(f"DESCONTO:      R$ {desconto:.2f}")
    print(f"TOTAL FINAL:   R$ {total_final:.2f}")
    print("================================")


print(" SISTEMA DE VENDAS ")

produtos = []
total_bruto = 0

quant_itens = int(input("Quantos produtos deseja registrar? "))

for i in range(quant_itens):
    nome, quantidade, preco_unitario = ler_produto(i + 1)
    subtotal = calcular_subtotal(quantidade, preco_unitario)

    produtos.append((nome, quantidade, preco_unitario, subtotal))
    total_bruto += subtotal

desconto = calcular_desconto(total_bruto)
total_final = calcular_total(total_bruto, desconto)

imprimir_cupom(produtos, total_bruto, desconto, total_final)
