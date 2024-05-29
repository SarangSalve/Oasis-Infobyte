package Projects;
	
		import java.util.ArrayList;
		import java.util.List;
		import java.util.Scanner;

		class Question {
		    private String questionText;
		    private List<String> options;
		    private int correctAnswer;

		    public Question(String questionText, List<String> options, int correctAnswer) {
		        this.questionText = questionText;
		        this.options = options;
		        this.correctAnswer = correctAnswer;
		    }

		    public String getQuestionText() {
		        return questionText;
		    }

		    public List<String> getOptions() {
		        return options;
		    }

		    public int getCorrectAnswer() {
		        return correctAnswer;
		    }
		}

		public class OnlineExaminationSystem {

		    private List<Question> questions;
		    private int score;

		    public OnlineExaminationSystem() {
		        questions = new ArrayList<>();
		        score = 0;
		        loadQuestions();
		    }

		    private void loadQuestions() {
		        List<String> options1 = new ArrayList<>();
		        options1.add("Java");
		        options1.add("Python");
		        options1.add("C++");
		        options1.add("JavaScript");
		        questions.add(new Question("Which programming language is used for Android development?", options1, 1));

		        List<String> options2 = new ArrayList<>();
		        options2.add("Earth");
		        options2.add("Mars");
		        options2.add("Jupiter");
		        options2.add("Saturn");
		        questions.add(new Question("Which planet is known as the Red Planet?", options2, 2));

		        List<String> options3 = new ArrayList<>();
		        options3.add("H2O");
		        options3.add("CO2");
		        options3.add("O2");
		        options3.add("N2");
		        questions.add(new Question("What is the chemical formula for water?", options3, 1));
		    }

		    public void displayQuestions() {
		        Scanner scanner = new Scanner(System.in);

		        for (int i = 0; i < questions.size(); i++) {
		            Question q = questions.get(i);
		            System.out.println("Question " + (i + 1) + ": " + q.getQuestionText());
		            List<String> options = q.getOptions();
		            for (int j = 0; j < options.size(); j++) {
		                System.out.println((j + 1) + ". " + options.get(j));
		            }

		            System.out.print("Enter your answer (1-4): ");
		            int answer = scanner.nextInt();

		            if (answer == q.getCorrectAnswer()) {
		                score++;
		            }
		        }

		        scanner.close();
		    }

		    public void displayResults() {
		    	System.out.println();
		        System.out.println("**** Your score: " + score + "*******" + "/" + questions.size());
		    }

		    public static void main(String[] args) {
		        OnlineExaminationSystem examSystem = new OnlineExaminationSystem();
		        examSystem.displayQuestions();
		        examSystem.displayResults();
		    }
		

	}


