# 1. 총 금액 X를 입력받음
X = int(input())

# 2. 구매한 물건의 종류 수 N 입력받음
N = int(input())

# 3. 실제 계산된 총 금액을 저장할 변수 생성
calculated_total = 0

# 4. N번 반복하면서 물건의 가격과 개수를 입력받고 계산
for _ in range(N):
    price, count = map(int, input().split())  # 물건의 가격과 개수를 한 줄에서 동시에 입력받음
    calculated_total += price * count  # 해당 물건의 총 가격을 계산해서 누적

# 5. 계산된 금액과 영수증의 금액을 비교
if calculated_total == X:
    print("Yes")
else:
    print("No")