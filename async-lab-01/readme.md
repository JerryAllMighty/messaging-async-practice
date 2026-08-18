Track 1. @Async — 비동기 처리 기초
1-1. 최소 비동기 메서드
목표: @EnableAsync + @Async가 실제로 별도 스레드에서 도는지 확인한다.
구현: 컨트롤러 → 서비스 메서드 호출, 서비스는 Thread.sleep으로 지연을 흉내내고 스레드 이름을 로그로 남긴다. CompletableFuture를 리턴한다.
심화: 커스텀 ThreadPoolTaskExecutor 빈으로 교체하고 core/max/queue 값을 바꿔가며 동작 차이를 관찰한다.
1-2. 여러 비동기 호출 조합
목표: 병렬로 2~3개를 던지고 결과를 합치는 패턴을 익힌다.
구현: 외부 API 3개를 호출한다고 가정하고 각각 다른 지연 시간을 준다. CompletableFuture.allOf / thenCombine으로 결과를 합산하고, 전체 소요 시간이 "합"이 아니라 "최댓값"에 가까운지 로그로 확인한다.
1-3. 비동기 예외 처리
목표: 비동기 메서드 안에서 터진 예외를 어떻게 잡는지 익힌다.
구현: AsyncUncaughtExceptionHandler를 커스텀 구현하고, 일부러 예외를 던져 로그로 캐치되는지 확인한다.