### Build
```bash
./mvnw clean install
```

### About it

Stock exchange application written in Kotlin with Java 20.
Imagine you want to be notified when something happens, some GOOGLE(GOOG) stock went up or down.
There are some simple rules(Equal, GreaterThan,LessThan) when the stock price change. Fake Data generation techniques are used to generate a lot of data for benchmarks.
Such solution would be used for Day Trading applications.

### System
Tested in
```
instance    vCPU    RAM
r5.4xlarge  16	    128
```

### Benchmark
```bash
Matching 10 events / 10 predicates resulted in: [100] match in 0 ms
Matching 100 events / 100 predicates resulted in: [10000] match in 1 ms
Matching 1000 events / 1000 predicates resulted in: [1000000] match in 88 ms
Matching 10000 events / 10000 predicates resulted in: [100000000] match in 10207 ms
Killed
```

### CAP 100 rules

Now we can do:
 * 100k in 155 ms
 * 1M in 1 second
 * 10M in 10 seconds

```bash
>> Benchmarks: CAP 100 rules
Matching 10 events / 100 predicates resulted in: [1000] match in 1 ms
Matching 100 events / 100 predicates resulted in: [10000] match in 1 ms
Matching 1000 events / 100 predicates resulted in: [100000] match in 14 ms
Matching 10000 events / 100 predicates resulted in: [1000000] match in 108 ms
Matching 100000 events / 100 predicates resulted in: [10000000] match in 1015 ms
Matching 1000000 events / 100 predicates resulted in: [100000000] match in 9499 ms
Matching 10000000 events / 100 predicates resulted in: [1000000000] match in 86415 ms

```


### Moving Forward

1. Implements queue system.
2. Implements redis to test performance.
3. Implement Kineis to validate performance. 
4. Implement a thread pool to process events.
5. Implement database connection to check performance with load user preferences.