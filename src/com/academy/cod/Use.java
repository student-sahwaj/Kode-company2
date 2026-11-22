package com.academy.cod;

public class Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person set = new Person(23,"sdfg","Bangalore");
		System.out.println(set.age + ", " + set.tyep + " , " + set.address);

	}

}
// /**
//┌─────────────────────┐
//│   Program starts    │
//└──────────┬──────────┘
//           │
//           ▼
//┌─────────────────────┐
//│    main() method    │
//└──────────┬──────────┘
//           │
//           ▼
//┌──────────────────────────────────┐
//│ new Person(23,"sdfg","Bangalore")│
//└────────────────┬─────────────────┘
//           │
//           ▼
//┌─────────────────────┐
//│ Person constructor  │
//│                     │
//│ Person(int, String, │
//│ String)             │
//└──────────┬──────────┘
//           │
//           ▼
//┌─────────────────────┐
//│ super(23,"sdfg",    │
//│       "Bangalore")  │
//└──────────┬──────────┘
//           │
//           ▼
//┌─────────────────────┐
//│ Shoaib constructor  │
//│                     │
//│ Shoaib(int, String, │
//│       String)       │
//└──────────┬──────────┘
//           │
//           ▼
//┌─────────────────────┐
//│ this.age = 23       │
//│ this.tyep = "sdfg"  │
//│ this.address =      │
//│ "Bangalore"         │
//└──────────┬──────────┘
//           │
//           ▼
//┌─────────────────────┐
//│ Object creation     │
//│ completed           │
//└──────────┬──────────┘
//           │
//           ▼
//┌─────────────────────┐
//│ System.out.println  │
//└──────────┬──────────┘
//           │
//           ▼
//┌─────────────────────┐
//│ 23, sdfg , Bangalore│
//└─────────────────────┘
