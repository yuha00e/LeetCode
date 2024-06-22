class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new LinkedList<>();
        Queue<Integer> sandwiche = new LinkedList<>();

        for(int i=0; i<students.length; i++) {
            student.add(students[i]);
            sandwiche.add(sandwiches[i]);
        }

        while(student.contains(sandwiche.peek())) {
            int frontStd = student.poll();
            if(frontStd == sandwiche.peek()) {
                sandwiche.poll();
            } else {
                student.add(frontStd);
            }
        }

        return student.size();

    }
}